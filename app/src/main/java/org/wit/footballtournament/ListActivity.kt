package org.wit.footballtournament

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView


class ListActivity : AppCompatActivity() {
    var listView: ListView? = null
    lateinit var states: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        listView = findViewById<View>(R.id.listView) as ListView
        val mBundle = intent.extras
        if (mBundle != null) {
            val county = mBundle.getString("CountyName")
            if (county.equals("Waterford United", ignoreCase = true)) {
                states = resources.getStringArray(R.array.waterford_states)
            } else if (county.equals("Cork Fc", ignoreCase = true)) {
                states = resources.getStringArray(R.array.cork_states)
            } else if (county.equals("Limerick City", ignoreCase = true)) {
                states = resources.getStringArray(R.array.Limerick_states)
            } else if (county.equals("Kerry Rangers", ignoreCase = true)) {
                states = resources.getStringArray(R.array.Kerry_states)
            } else if (county.equals("Tipperary Park", ignoreCase = true)) {
                states = resources.getStringArray(R.array.Tipperary_states)
            } else if (county.equals("Galway United", ignoreCase = true)) {
                states = resources.getStringArray(R.array.Galway_states)
            } else if (county.equals("Dublin Fc", ignoreCase = true)) {
                states = resources.getStringArray(R.array.Dublin_states)
            } else if (county.equals("Kilkenny Stars", ignoreCase = true)) {
                states = resources.getStringArray(R.array.Kilkenny_states)
            } else if (county.equals("Wexford United", ignoreCase = true)) {
                states = resources.getStringArray(R.array.Wexford_states)
            } else if (county.equals("Sligo Stars", ignoreCase = true)) {
                states = resources.getStringArray(R.array.Sligo_states)
            }
        }
        val mAdapter = ArrayAdapter(
            this@ListActivity,
            android.R.layout.simple_list_item_1,
            states
        )
        listView!!.adapter = mAdapter
    }
}