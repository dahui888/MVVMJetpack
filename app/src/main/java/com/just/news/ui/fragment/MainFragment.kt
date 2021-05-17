package com.just.news.ui.fragment

import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.common.base.CommonBaseFragment
import com.common.network.LogUtils
import com.just.news.R
import com.just.news.databinding.FragmentMainBinding

/**
 *create by 2020/6/19
 * 主界面
 *@author zt
 */
class MainFragment : CommonBaseFragment<FragmentMainBinding>() {
    override fun getLayout(): Int {
        return R.layout.fragment_main
    }

    override fun initView() {

        view?.let { navigate(it, R.id.NewFragment) }

        val navController = findNavController()//fragment返回数据处理

        navController.currentBackStackEntry?.savedStateHandle?.getLiveData<String>("key")?.observe(this,
                Observer {
                    LogUtils.e(TAG + it.toString())
                })
    }

    override fun loadData() {//懒加载
    }
}