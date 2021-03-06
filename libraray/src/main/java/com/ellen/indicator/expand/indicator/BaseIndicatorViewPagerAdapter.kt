package com.ellen.indicator.expand.indicator

import android.content.res.ColorStateList
import android.graphics.Color
import com.ellen.indicator.Adapter
import com.ellen.indicator.BaseIndicatorViewHolder
import com.google.android.material.tabs.TabLayout

abstract class BaseIndicatorViewPagerAdapter<T : BaseIndicatorViewHolder>:
    Adapter<T>() {

    var tabCount = 0

    override fun getItemSize(): Int {
        return if(mode == Mode.FREE){
            tabCount
        }else {
            super.getItemSize()
        }
    }

    override fun getItemType(position: Int): Int {
        return 0
    }

    override fun showContent(holder: T) {

    }

    override fun settingTabLayout(tabLayout: TabLayout) {
        tabLayout.tabRippleColor = ColorStateList.valueOf(Color.TRANSPARENT)
        tabLayout.tabMode = TabLayout.MODE_FIXED
        tabLayout.setSelectedTabIndicator(null)
    }
}