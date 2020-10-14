package jp.techacademy.sugawara.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //足し算〜割り算の4つのボタン押下後を操作
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v!!.id == R.id.button1){
            additionFunction()
        } else if (v.id == R.id.button2){
            subtractionFunction()
        } else if (v.id == R.id.button3){
            multiplicationFunction()
        } else if (v.id == R.id.button4){
            divisionFunction()
        }
    }

    //足し算のボタンを押下
    private fun additionFunction(){
        //2つのEditTextで書かれた数字の管理
        var value1 :Double?
        var value2 :Double?

        //演算結果の値を管理する変数
        var result :Double

        //SecondActivityへ画面遷移
        val intent = Intent(this, SecondActivity::class.java)

        //Int型にする
        value1 = editText1.text.toString().toDouble()
        value2 = editText2.text.toString().toDouble()
        
        //空判定
        if (value1.equals(null) || value2.equals(null)){
            value1 = 0.0
            value2 = 0.0
        }

        result = value1 + value2

        //小数点に対応した、データの送信
        intent.putExtra("result", result)
        startActivity(intent)
    }

    //引き算のボタンを押下
    private fun subtractionFunction(){
        //2つのEditTextで書かれた数字の管理
        var value1 :Double
        var value2 :Double

        //演算結果の値を管理する変数
        var result :Double

        //SecondActivityへ画面遷移
        val intent = Intent(this, SecondActivity::class.java)

        //Int型にする
        value1 = editText1.text.toString().toDouble()
        value2 = editText2.text.toString().toDouble()

        result = value1 - value2

        //小数点に対応した、データの送信
        intent.putExtra("result", result)
        startActivity(intent)
    }

    //掛け算のボタンを押下
    private fun multiplicationFunction(){
        //2つのEditTextで書かれた数字の管理
        var value1 :Double
        var value2 :Double

        //演算結果の値を管理する変数
        var result :Double

        //SecondActivityへ画面遷移
        val intent = Intent(this, SecondActivity::class.java)

        //Int型にする
        value1 = editText1.text.toString().toDouble()
        value2 = editText2.text.toString().toDouble()

        result = value1 * value2

        //小数点に対応した、データの送信
        intent.putExtra("result", result)
        startActivity(intent)
    }

    //割り算のボタンを押下
    private fun divisionFunction(){
        //2つのEditTextで書かれた数字の管理
        var value1 :Double
        var value2 :Double

        //演算結果の値を管理する変数
        var result :Double

        //SecondActivityへ画面遷移
        val intent = Intent(this, SecondActivity::class.java)

        //Int型にする
        value1 = editText1.text.toString().toDouble()
        value2 = editText2.text.toString().toDouble()

        result = value1 / value2

        //小数点に対応した、データの送信
        intent.putExtra("result", result)
        startActivity(intent)
    }

}
