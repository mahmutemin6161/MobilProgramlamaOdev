package com.example.mobilprogramlamaodev

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), FragmentCom {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemview = item.itemId

        when(itemview)
        {
            R.id.me -> {
                startActivity(Intent(this, AboutMe::class.java))

            }
        }

        return false
    }

    override fun passDataCom(positionId: String) {


        val bundle = Bundle()
        bundle.putString("position", positionId)
        val transaction = this.supportFragmentManager.beginTransaction()
        val detailsFragment = DetailsFragment()
        detailsFragment.arguments = bundle

        transaction.replace(R.id.fragmentContainerView, detailsFragment)
        transaction.addToBackStack(null)
        transaction.commit()



    }
}