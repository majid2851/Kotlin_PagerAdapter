package com.example.pageradapterkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.PagerAdapter
import com.example.kotlinpageradapter.MyModel
import com.example.kotlinpageradapter.R
import com.example.kotlinpageradapter.databinding.PatternRvBinding

class MyPagerAdapter : PagerAdapter
{
    private var items:List<MyModel> = ArrayList()
    var context:Context

    constructor(items:List<MyModel>,context: Context){
        this.items=items
        this.context=context;
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var binding:PatternRvBinding
        binding=DataBindingUtil.inflate(LayoutInflater.from(context)
            ,R.layout.pattern_rv,container,false)
        binding.model=items.get(position)

        container.addView(binding.root)
        return binding.root
    }

    override fun getCount(): Int {
        return items.size
    }

    override fun isViewFromObject(view: View, object2: Any): Boolean {
        return (view==object2)
    }


    override fun destroyItem(container: ViewGroup, position: Int, object2: Any) {
        container.removeView(object2 as View?)
    }

}