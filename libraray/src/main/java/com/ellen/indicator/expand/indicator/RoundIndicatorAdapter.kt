package com.ellen.indicator.expand.indicator

import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.View
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.ellen.indicator.BaseViewHolder
import com.ellen.libraray.R

/**
 * 圆点指示器
 */
class RoundIndicatorAdapter :
    BaseIndicatorViewPagerAdapter<RoundIndicatorViewHolder> {

    private var unSelectColor:Int = 0
    private var selectColor:Int = 0

    constructor(selectColor:Int,unSelectColor:Int){
        this.unSelectColor = unSelectColor
        this.selectColor = selectColor
    }

    override fun getViewHolder(viewType: Int): RoundIndicatorViewHolder {
        return RoundIndicatorViewHolder(R.layout.item_tab_layout_round_view)
    }

    override fun onTabReselected(holder: RoundIndicatorViewHolder) {
        val drawable = ShapeDrawable(OvalShape())
        drawable.paint.color = selectColor
        holder.view.background = drawable
    }

    override fun onTabUnselected(holder: RoundIndicatorViewHolder) {
        val drawable = ShapeDrawable(OvalShape())
        drawable.paint.color = unSelectColor
        holder.view.background = drawable
    }

    override fun onTabSelected(holder: RoundIndicatorViewHolder) {
        val drawable = ShapeDrawable(OvalShape())
        drawable.paint.color = selectColor
        holder.view.background = drawable
    }

    override fun initTab(holder: RoundIndicatorViewHolder) {
        val drawable = ShapeDrawable(OvalShape())
        drawable.paint.color = unSelectColor
        holder.view.background = drawable
    }
}


class RoundIndicatorViewHolder(layoutId:Int): BaseViewHolder(layoutId){
    lateinit var view:View
    override fun bindView(itemView: View) {
        view = itemView.findViewById(R.id.view)
    }
}