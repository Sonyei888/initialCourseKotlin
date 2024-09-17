package com.sonyei888.androidmaster.superheroapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.sonyei888.androidmaster.R
import com.sonyei888.androidmaster.databinding.ActivitySuperHeroListBinding
import com.sonyei888.androidmaster.superheroapp.DetailSuperheroActivity.Companion.EXTRA_ID
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SuperHeroListActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySuperHeroListBinding
    private lateinit var retrofit: Retrofit

    private lateinit var adapter: SuperheroAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuperHeroListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        retrofit = getRetrofit()

        initUI()
    }

    private fun initUI() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchByName(query.orEmpty())
                return false
            }

            override fun onQueryTextChange(newText: String?) = false
        })
        adapter = SuperheroAdapter{navigateToDetail(it)}
        binding.rvSuperherop.setHasFixedSize(true)
        binding.rvSuperherop.layoutManager = LinearLayoutManager(this)
        binding.rvSuperherop.adapter = adapter
    }

    private fun searchByName(query: String) {
        binding.progressBar.isVisible = true
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val myResponse = retrofit.create(ApiService::class.java).getSuperheroes(query)
                if (myResponse.isSuccessful) {
                    val response: SuperHeroDataResponse? = myResponse.body()
                    if (response != null && response.superheroes.isNotEmpty()) {
                        Log.i("Sonyei8888", response.toString())
                        runOnUiThread {
                            adapter.updateList(response.superheroes)
                            binding.progressBar.isVisible = false
                        }
                    } else {
                        runOnUiThread {
                            showErrorMessage("No se encontraron super heroes con ese nombre.")
                            binding.progressBar.isVisible = false
                        }
                    }
                } else {
                    Log.e("Sonyei8888", "Error fetching superheroes: ${myResponse.errorBody()?.string()}")
                    runOnUiThread {
                        showErrorMessage("Error al obtener los superhéroes. Inténtalo de nuevo.")
                        binding.progressBar.isVisible = false
                    }
                }
            } catch (e: Exception) {
                Log.e("Sonyei8888", "Exception occurred: ${e.message}", e)
                runOnUiThread {
                    showErrorMessage("No se encontraron superheroes con ese nombre.")
                    binding.progressBar.isVisible = false
                }
            }
        }
    }

    private fun showErrorMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://superheroapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    private fun navigateToDetail(id:String){
        val intent = Intent(this, DetailSuperheroActivity::class.java)
        intent.putExtra(EXTRA_ID, id)
        startActivity(intent)
    }
}