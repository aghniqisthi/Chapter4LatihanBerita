package com.example.chapter4latihanberita

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BeritaViewModel : ViewModel() {

    var list = arrayListOf(
        ListBerita("Tech Companies Say Going Private Comes With Benefits", "Sept. 1, 2022 5:30 AM ET", R.drawable.berita_twt, " Angus Loten",
            "Private-equity firms are snapping up public companies at a record pace, a move that can rattle chief information officers as trusted tech vendors come under new management.\n" +
                    "\n" +
                    "Newly private tech firms and their private-equity owners say the change is for the better, partly because the companies can focus on the long term instead of on delivering quarterly profits—although the shift typically comes with some growing pains and concerns.\n" +
                    "\n" +
                    "“One of the biggest risks as a CIO when one of your vendors gets acquired is the product you have: Is that the one that will get killed to cut costs?” said Garrett Bekker, principal research analyst at market-research firm SNP Global Market Intelligence. “Generally you don’t want your vendor to get acquired,” Mr. Bekker said.\n" +
                    "\n" +
                    "“From our standpoint, we know customers and other stakeholders get nervous,” said Monti Saroya, senior managing director and co-head of Vista Equity Partners’ Flagship Fund. Vista said earlier this year that it planned to acquire software company Citrix Systems Inc. in a deal valued at \$16.5 billion, including debt, and in early August said it would buy cloud-based tax-management software maker Avalara Inc. for \$8.4 billion.\n" +
                    "\n" +
                    "Mr. Saroya said customers’ concerns are typically addressed quickly because Vista focuses on helping its acquisitions scale up their offerings.\n" +
                    "\n" +
                    "“In a private setting, we’re very much more focused on long-term growth and we worry less about quarterly performance,” he said, adding, “The adjustment is actually on mind-set."),
        ListBerita("Judul 2", "Tanggal 2", R.drawable.berita_twt, "Jurnalis 2", ""),
        ListBerita("Judul 3", "Tanggal 3", R.drawable.berita_twt, "Jurnalis 3", "")
    )
    val beritaList: MutableLiveData<List<ListBerita>> = MutableLiveData()

    fun getBerita(){
        val berita = list
        beritaList.value = berita
    }
}