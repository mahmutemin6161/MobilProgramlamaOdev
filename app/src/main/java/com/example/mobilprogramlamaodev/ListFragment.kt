package com.example.mobilprogramlamaodev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ListFragment : Fragment(), ExampleAdapter.OnItemClickListener {

    private lateinit var fragmentcom : FragmentCom

    val isimListe = arrayOf(
        arrayOf("Dr. Edwin Orn","ConnorHartman71@gmail.com"),
        arrayOf("Alford Hoeger", "Rick83@gmail.com"),
        arrayOf("Terrance Halvorson", "Kenton_Wisoz@hotmail.com"),
        arrayOf("Morgan McGlynn", "Adah_Streich14@gmail.com"),
        arrayOf("Ms. Ramiro DuBuque", "Fornest_Tey@yahoo.com"),
        arrayOf("Kolby Orn", "Kay.Kuhn22@yahoo.com"),
        arrayOf("Elijag Schoen MD", "Mya_Leuschke@yahoo.com"),
        arrayOf("Colton Kohler", "Stephen49@hotmail.com"),
        arrayOf("Myrits Becker", "Leetita_Brown98@gmail.com"),
        arrayOf("Luella Marks", "Christine_Reynalde@gmail.com"),
        arrayOf("Mose Ullrich", "ennco9@hotmail.com"),
        arrayOf("Elenor Zboncak", "Lavina_Wolf@hotmail.com"),
        arrayOf("Rubye Zboncak", "Rachael.Hilis65@gmail.com"),
        arrayOf("Oscar Muller", "Jasper45@hotmail.com"),
    )

    private lateinit var view: View;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

         view = inflater.inflate(R.layout.fragment_list, container, false) as View
        val exampleList = generateDummyList(isimListe.size)

        val adapter = ExampleAdapter(exampleList, this)

        val recycler_view:RecyclerView = view.findViewById(R.id.recyler_view)
        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this.context)
        recycler_view.setHasFixedSize(true)


        return view
    }



    private fun generateDummyList(size: Int): List<ExampleItem>{

        val list = ArrayList<ExampleItem>()
        val numara1 = 0;
        val numara2 = 1;
        for(i in 0 until size)
        {

                val item = ExampleItem((isimListe.get(i).get(numara1)).toString(), (isimListe.get(i).get(numara2)).toString())
                list += item

        }
        return list
    }


    override fun onItemClick(position: Int) {


        fragmentcom = activity as FragmentCom

        fragmentcom.passDataCom(position.toString())



    }


}