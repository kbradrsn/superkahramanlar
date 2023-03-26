package com.example.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Spiderman")


      /*  val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val aquaBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)

   var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(aquaBitmap)
        superKahramanGorselleri.add(spidermanBitmap)*/


        val batmanDrableId = R.drawable.batman
        val supermanDrableId = R.drawable.superman
        val aquamanDrableId = R.drawable.aquaman
        val spidermanDrableId = R.drawable.spiderman

            var superKahramanDrawbleListesi = ArrayList<Int>()
        superKahramanDrawbleListesi.add(batmanDrableId)
        superKahramanDrawbleListesi.add(supermanDrableId)
        superKahramanDrawbleListesi.add(aquamanDrableId)
        superKahramanDrawbleListesi.add(spidermanDrableId)




        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superKahramanIsimleri,superKahramanDrawbleListesi)
        recyclerView.adapter = adapter
    }
}