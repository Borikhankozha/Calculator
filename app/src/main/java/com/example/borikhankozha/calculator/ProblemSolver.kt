package com.example.borikhankozha.calculator

import android.util.Log

/**
 * Created by borikhankozha on 6/11/17.
 */

class ProblemSolver {
	
	fun solveAllMultDiv(content: String): String {
		var ans = ""
		var content2 = content
		if (content[0] == '-') {
			content2 = "0$content"
		}
		
		var elements: List<String> = content2.split("+")
		
		for (i in 0..elements.size - 1) {
			var elements2: List<String> = elements.get(i).split("-")
			var res = getMultDiv(elements2.get(0))
			for (j in 1..elements2.size - 1) {
				res = res + "-" + getMultDiv(elements2.get(j))
			}
			ans += "$res+"
		}
		ans = ans.substring(0, ans.length - 1)
		
		return ans
	}
	
	fun solveAllAddSub(content: String): String = solveAllAddition(insertPlusBeforeMinus(content))
	
	private fun getMultDiv(content: String): String {
		var elements: List<String> = content.split('*')
		
		var mult = 1.0
		for (i in 0..elements.size - 1) {
			var elements2: List<String> = elements.get(i).split('/')
			var div = elements2.get(0).toDouble()
			for (j in 1..elements2.size - 1) {
				div /= elements2.get(j).toDouble()
			}
			mult *= div
		}
		
		return mult.toString()
	}
	
	private fun insertPlusBeforeMinus(content: String): String {
		var ans: String
		
		var elements: List<String> = content.split('-')
		
		if (elements.get(0) == "") {
			ans = "0"
		} else {
			ans = elements.get(0)
		}
		for (i in 1..elements.size - 1) {
			ans = ans + "+-" + elements.get(i)
		}
		
		return ans
	}
	
	private fun solveAllAddition(content: String): String {
		var elements: List<String> = content.split('+')
		
		var sum = 0.0
		for (i in 0..elements.size - 1) {
			sum += elements.get(i).toDouble()
		}
		
		return sum.toString()
	}
	
}