package com.eldorteshaboev.ussd_by_using_nav_component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eldorteshaboev.ussd_by_using_nav_component.models.MyTrafficAdapter
import kotlinx.android.synthetic.main.fragment_traffic.*
import kotlinx.android.synthetic.main.fragment_traffic.view.*
import java.text.FieldPosition

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TraficFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TrafficFragment : Fragment() {
    lateinit var root:View
    lateinit var list: ArrayList<Traffics>
    lateinit var myTrafficAdapter: MyTrafficAdapter
     var position = 0
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        list = ArrayList()
        myTrafficAdapter = MyTrafficAdapter(list)
        root=inflater.inflate(R.layout.fragment_traffic, container, false)
        root.recyclerV.adapter = myTrafficAdapter

        list.add(Traffics("Mobi 20","*111*120#","2000/67 daqiqa\n" +
                "\n" +
                "(oyiga/kuniga) MOBIUZ abonentlariga, O‘zbekistonning boshqa mobil operatorlari abonentlariga,Shahar raqamlariga chiquvchi qo'ng'iroqlarga\t\n" +
                "2 000/67 MB\n" +
                "\n" +
                "Mobil internet (oyiga/kuniga)\t\n" +
                "2000/67 SMS\n" +
                "\n" +
                "(oyiga/kuniga )"))
        list.add(Traffics("Mobi 25","*111*102#","3500/117 daqiqa (oyiga/kuniga)\n" +
                "\n" +
                "MOBIUZ abonentlariga , O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga\t\n" +
                "3500 /117 MB (oyiga/kuniga)\n" +
                "\n" +
                "Mobil internet\t\n" +
                "3500/117 SMS\n" +
                "\n" +
                "(oyiga/kuniga)"))
        list.add(Traffics("Mobi 30+","*111*128#","5000/167 daqiqa\n" +
                "\n" +
                "MOBIUZ abonentlariga , O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga\t\n" +
                "5000/167 MB\n" +
                "\n" +
                "mobil internet oyiga/kuniga\t\n" +
                "3500/117 SMS\n" +
                "\n" +
                "oyiga/kuniga"))
        list.add(Traffics("Mobi 40","*111*122#","UNLIM\n" +
                "\n" +
                "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga\t\n" +
                "5 000/167 daqiqa (oyiga/kuniga)\n" +
                "\n" +
                "O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlarga\t\n" +
                "8 000/267 MB\n" +
                "\n" +
                "Mobil internet (oyiga/kuniga)\t\n" +
                "3 500/117 SMS\n" +
                "\n" +
                "(oyiga/kuniga)"))
        list.add(Traffics("Mobi 50","*111*129#","UNLIM\n" +
                "\n" +
                "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga\t\n" +
                "5 000 daqiqa\n" +
                "\n" +
                "O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlarga\t\n" +
                "10 000 MB\n" +
                "\n" +
                "Mobil internet\t\n" +
                "3 500 SMS\n" +
                "\n" +
                "oyiga"))
        list.add(Traffics("Mobi 70","*111*131#","UNLIM\n" +
                "\n" +
                "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga\t\n" +
                "5 000 daqiqa\n" +
                "\n" +
                "O’zbekistonning boshqa mobil operatorlari abonentlarga, shahar raqamlariga\t\n" +
                "20 000 MB\n" +
                "\n" +
                "Mobil internet\t\n" +
                "3 500 SMS\n" +
                "\n" +
                "oyiga"))
        list.add(Traffics("Mobi 90","*111*132#","UNLIM\n" +
                "\n" +
                "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga\t\n" +
                "5 000 daqiqa\n" +
                "\n" +
                "O’zbekistonning boshqa mobil operatorlari abonentlariga,shahar raqamlariga\t\n" +
                "65 000 MB\n" +
                "\n" +
                "Mobil internet"))
        list.add(Traffics("Mobi 110","*111*133#","UNLIM\n" +
                "\n" +
                "O‘zbekiston bo‘yicha barcha chiquvchi qo‘ng‘iroqlarga\t\n" +
                "80 000 MB\n" +
                "\n" +
                "Mobil internet\t\n" +
                "5 000\n" +
                "\n" +
                "SMS"))
        list.add(Traffics("Mobi 150","*111*134#","UNLIM\n" +
                "\n" +
                "O‘zbekiston bo‘yicha barcha chiquvchi qo‘ng‘iroqlarga\t\n" +
                "100 000 MB\n" +
                "\n" +
                "Mobil internet\t\n" +
                "10 000\n" +
                "\n" +
                "SMS"))


        /*root.recyclerV.layoutManager = LinearLayoutManager(view?.context)
        myTrafficAdapter = MyTrafficAdapter(list)
        recyclerV.adapter = myTrafficAdapter
        myTrafficAdapter.setOnItemClickListener(object:MyTrafficAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                root.findNavController().navigate(R.id.aboutTraffic)
            }

        })*/


        myTrafficAdapter.setOnItemClickListener(object:MyTrafficAdapter.OnItemClickListener{

            override fun onItemClick(position: Int) {

                root.recyclerV.findNavController().navigate(R.id.aboutTraffic, bundleOf("key" to position))
            }

        })

       root.recyclerV.apply {
            setHasFixedSize(true)
            adapter = myTrafficAdapter

            addItemDecoration(DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL))
        }


        return root
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TraficFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TrafficFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


}