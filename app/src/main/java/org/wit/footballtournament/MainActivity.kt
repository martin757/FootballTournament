package org.wit.footballtournament

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import org.wit.footballtournament.model.Location

class MainActivity : AppCompatActivity() {
    var toolbar: Toolbar? = null
    var listView: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar =
            findViewById<View>(R.id.toolbar) as Toolbar
        toolbar!!.title = resources.getString(R.string.app_name)
        listView = findViewById<View>(R.id.listView) as ListView
        val mAdapter = ArrayAdapter(
            this@MainActivity,
            android.R.layout.simple_list_item_1,
            resources.getStringArray(R.array.counties)
        )
        listView!!.onItemClickListener =
            OnItemClickListener { adapterView, view, i, l ->
                val it = Intent(this@MainActivity, ListActivity::class.java)
                it.putExtra("CountyName", listView!!.getItemAtPosition(i).toString())
                startActivity(it)
            }
        listView!!.adapter = mAdapter












    }
}