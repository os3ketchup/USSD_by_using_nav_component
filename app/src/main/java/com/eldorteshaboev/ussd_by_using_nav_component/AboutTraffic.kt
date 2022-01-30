package com.eldorteshaboev.ussd_by_using_nav_component

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eldorteshaboev.ussd_by_using_nav_component.models.StringResources
import kotlinx.android.synthetic.main.fragment_about_traffic.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
val stringResources = StringResources()
/**
 * A simple [Fragment] subclass.
 * Use the [AboutTrafic.newInstance] factory method to
 * create an instance of this fragment.
 */
class AboutTraffic : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var root:View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        root =  inflater.inflate(R.layout.fragment_about_traffic, container, false)

        when(arguments?.getInt("key",0)){
            1->root.tv_about_traffic_title.text = "Mobi 25"
            2->root.tv_about_traffic_title.text = "Mobi 30+"
            3->root.tv_about_traffic_title.text = "Mobi 40"
            4->root.tv_about_traffic_title.text = "Mobi 50"
            5->root.tv_about_traffic_title.text = "Mobi 70"
            6->root.tv_about_traffic_title.text = "Mobi 90"
            7->root.tv_about_traffic_title.text = "Mobi 110"
            8->root.tv_about_traffic_title.text = "Mobi 150"
        }
        when(arguments?.getInt("key",0)){
            1->root.tv_about_traffic_context.text = stringResources.mobi25
            2->root.tv_about_traffic_context.text = stringResources.mobi30plus
            3->root.tv_about_traffic_context.text = stringResources.mobi40
            4->root.tv_about_traffic_context.text = stringResources.mobi50
            5->root.tv_about_traffic_context.text = stringResources.mobi70
            6->root.tv_about_traffic_context.text = stringResources.mobi90
            7->root.tv_about_traffic_context.text = stringResources.mobi110
            8->root.tv_about_traffic_context.text = stringResources.mobi50

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
         * @return A new instance of fragment AboutTrafic.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AboutTraffic().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}