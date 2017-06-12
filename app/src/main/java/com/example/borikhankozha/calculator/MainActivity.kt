package com.example.borikhankozha.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
	
	var content: String = ""
	val ps = ProblemSolver()
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		val display = findViewById(R.id.display) as TextView
		val clear = findViewById(R.id.clear) as Button
		val mult = findViewById(R.id.mult) as Button
		val div = findViewById(R.id.div) as Button
		val add = findViewById(R.id.add) as Button
		val sub = findViewById(R.id.sub) as Button
		val equal = findViewById(R.id.equal) as Button
		val one = findViewById(R.id.one) as Button
		val two = findViewById(R.id.two) as Button
		val three = findViewById(R.id.three) as Button
		val four = findViewById(R.id.four) as Button
		val five = findViewById(R.id.five) as Button
		val six = findViewById(R.id.six) as Button
		val seven = findViewById(R.id.seven) as Button
		val eight = findViewById(R.id.eight) as Button
		val nine = findViewById(R.id.nine) as Button
		val zero = findViewById(R.id.zero) as Button
		val back = findViewById(R.id.back) as Button
		val dot = findViewById(R.id.dot) as Button
		val answer = findViewById(R.id.answer) as TextView
		
		one.setOnClickListener {
			display.setText(display.getText().toString() + "1")
		}
		
		two.setOnClickListener {
			display.setText(display.getText().toString() + "2")
		}
		
		
		three.setOnClickListener {
			display.setText(display.getText().toString() + "3")
		}
		
		four.setOnClickListener {
			display.setText(display.getText().toString() + "4")
		}
		
		five.setOnClickListener {
			display.setText(display.getText().toString() + "5")
		}
		
		six.setOnClickListener {
			display.setText(display.getText().toString() + "6")
		}
		
		seven.setOnClickListener {
			display.setText(display.getText().toString() + "7")
		}
		
		eight.setOnClickListener {
			display.setText(display.getText().toString() + "8")
		}
		
		nine.setOnClickListener {
			display.setText(display.getText().toString() + "9")
		}
		
		zero.setOnClickListener {
			display.setText(display.getText().toString() + "0")
		}
		
		add.setOnClickListener {
			display.setText(display.getText().toString() + "+")
		}
		
		sub.setOnClickListener {
			display.setText(display.getText().toString() + "-")
		}
		
		mult.setOnClickListener {
			display.setText(display.getText().toString() + "*")
		}
		
		div.setOnClickListener {
			display.setText(display.getText().toString() + "/")
		}
		
		dot.setOnClickListener {
			display.setText(display.getText().toString() + ".")
		}
		
		clear.setOnClickListener {
			display.setText("")
			answer.setText("")
		}
		
		equal.setOnClickListener {
			content = display.getText().toString()
			content = ps.solveAllMultDiv(content)
			content = ps.solveAllAddSub(content)
			answer.setText(content)
		}
		
		back.setOnClickListener {
			content = display.getText().toString()
			if (content.length != 0) {
				display.setText(content.substring(0, content.length - 1))
			}
		}
	}
}
