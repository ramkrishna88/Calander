package com.example.calander

import android.app.PendingIntent.getActivity
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.example.calander.databinding.ActivityMainBinding
import com.example.calander.databinding.ContentMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var toolbar1 :Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        val navController = findNavController(R.id.nav_host_fragment)
        val  appBarConfiguration = AppBarConfiguration(setOf(R.id.action_settings))
        setupActionBarWithNavController(navController,appBarConfiguration)


        binding.floatingActionButton4.setOnClickListener {
            Snackbar.make(binding.root, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun checkCallingOrSelfPermission(permission: String): Int {
        return super.checkCallingOrSelfPermission(permission)
    }



    override fun startActivityFromFragment(
        fragment: Fragment,
        intent: Intent?,
        requestCode: Int,
        options: Bundle?
    ) {
        super.startActivityFromFragment(fragment, intent, requestCode, options)
    }

    override fun enforceCallingOrSelfPermission(permission: String, message: String?) {
        super.enforceCallingOrSelfPermission(permission, message)
    }

    fun onStart(MainActivity :ActivityMainBinding) {
        super.onStart()
    }

    fun onRestart(MainActivity: ActivityMainBinding) {
        super.onRestart()
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}