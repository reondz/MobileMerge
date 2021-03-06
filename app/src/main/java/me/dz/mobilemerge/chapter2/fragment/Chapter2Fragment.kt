package me.dz.mobilemerge.chapter2.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import me.dz.mobilemerge.R

class Chapter2Fragment: Fragment() {

    companion object {
        private const val ARG_TEXT = "arg_text"

        /**
         * 推荐使用静态方法 newInstance 来创建 Fragment
         * 推荐使用 set arguments 来传递参数
         */
        fun newInstance(text: String): Chapter2Fragment {
            val args = Bundle()
            args.putString(ARG_TEXT, text)
            val fragment = Chapter2Fragment()
            fragment.arguments = args
            return fragment
        }
    }

    var text = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * 使用 arguments 获取参数，在内存回收前，系统会帮你保存数据，恢复页面时不会造成数据的丢失
         */
        arguments?.let {
            text = it.getString(ARG_TEXT) ?: ""
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chapter_2, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv = view.findViewById<AppCompatTextView>(R.id.tv)
        tv.text = text
    }


}