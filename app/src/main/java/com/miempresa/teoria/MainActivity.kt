package com.miempresa.teoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        menu?.getItem(2)?.setEnabled(false)
        menu?.getItem(3)?.isVisible = false
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var selectedOption = ""

        when(item?.itemId){
            R.id.about_us -> selectedOption = "about us"
            R.id.help -> selectedOption = "help"
            R.id.item_1 -> selectedOption = "item 1"
            R.id.item_2 -> selectedOption = "item 2"
            R.id.item_3 -> selectedOption = "item 3"
        }

        Toast.makeText(this, "Option: " + selectedOption, Toast.LENGTH_SHORT).show()

        return super.onOptionsItemSelected(item)
    }

    override fun registerForContextMenu(view: View?) {
        super.registerForContextMenu(view)
    }

}