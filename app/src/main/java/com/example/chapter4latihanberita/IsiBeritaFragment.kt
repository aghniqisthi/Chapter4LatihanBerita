package com.example.chapter4latihanberita

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_isi_berita.*

class IsiBeirtaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_isi_berita, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getJudul = arguments?.getString("judul")
        var getJurnalis = arguments?.getString("jurnalis")
        var getTanggal = arguments?.getString("tanggal")
        var getGambar = arguments?.getInt("gambar")
        var getIsi = arguments?.getString("isi")

        judulIsi.text = getJudul
        jurnalis.text = getJurnalis
        tanggalIsi.text = getTanggal
        gambarIsi.setImageResource(getGambar!!)
        isiBerita.text = getIsi
    }

}