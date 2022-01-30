package com.eldorteshaboev.ussd_by_using_nav_component.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eldorteshaboev.ussd_by_using_nav_component.R
import com.eldorteshaboev.ussd_by_using_nav_component.Traffics
import kotlinx.android.synthetic.main.item_rv.view.*

class MyTrafficAdapter(val list:List<Traffics>):RecyclerView.Adapter<MyTrafficAdapter.VH>() {
    private lateinit var onItemClickListener: OnItemClickListener
    inner class VH(var itemRV: View):RecyclerView.ViewHolder(itemRV){
        fun onBind(traffics: Traffics){
            itemRV.tv_name_traffic.text = traffics.trafficName
            itemRV.tv_traffic_code.text = traffics.trafficCode
            itemRV.tv_about_traffic.text = traffics.aboutTraffic
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {



        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_rv,parent,false))

    }
    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        this.onItemClickListener = onItemClickListener
    }

    private fun getItem(position: Int): Traffics {
        return list[position]
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(getItem(position))
        holder.itemView.setOnClickListener(View.OnClickListener {
            onItemClickListener.onItemClick(
                position
            )
        })
    }

    override fun getItemCount(): Int {
        return list.size
    }
    interface OnItemClickListener{
        fun onItemClick(position: Int){

        }
    }

}