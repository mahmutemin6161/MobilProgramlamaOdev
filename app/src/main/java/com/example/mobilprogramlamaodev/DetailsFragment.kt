package com.example.mobilprogramlamaodev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class DetailsFragment : Fragment() {

    var incomingId: String? = "";

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_details, container, false)

         incomingId = arguments?.getString("position")



        val text_position:TextView = view.findViewById(R.id.text_position)
        val text_isim:TextView = view.findViewById(R.id.text_ad)
        val text_mail:TextView = view.findViewById(R.id.text_mail)

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



       text_position.setText(incomingId)
        text_isim.setText((isimListe.get(incomingId.toString().toInt()).get(0)).toString())
        text_mail.setText((isimListe.get(incomingId.toString().toInt()).get(1)).toString())


        return view
    }




}