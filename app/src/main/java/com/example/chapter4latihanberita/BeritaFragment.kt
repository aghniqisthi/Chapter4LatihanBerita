package com.example.chapter4latihanberita

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_berita.*

class BeritaFragment : Fragment() {

    private lateinit var viewModel: BeritaViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_berita, container, false)
    }

    lateinit var adapterBerita: BeritaAdapter
    lateinit var vmBerita : BeritaViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        vmBerita = ViewModelProvider(this).get(BeritaViewModel::class.java)
        // TODO: Use the ViewModel
        vmBerita = ViewModelProvider(this).get(BeritaViewModel::class.java)

        vmBerita.getBerita()
        vmBerita.beritaList.observe(viewLifecycleOwner, {
            adapterBerita.setDataBerita(it as ArrayList<ListBerita>)
        })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapterBerita = BeritaAdapter(ArrayList())
        rvBerita.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rvBerita.adapter = adapterBerita

        adapterBerita.onClick = {
            val bundle = Bundle()
            bundle.putString("judul", it.judul)
            bundle.putString("jurnalis", it.jurnalis)
            bundle.putString("tanggal", it.tanggal)
            bundle.putInt("gambar", it.gambar)
            bundle.putString("isi", it.isi)
            Navigation.findNavController(view).navigate(R.id.action_beritaFragment_to_isiBeirtaFragment, bundle)
        }
    }

}