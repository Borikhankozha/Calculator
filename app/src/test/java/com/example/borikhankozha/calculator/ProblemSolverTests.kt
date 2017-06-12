package com.example.borikhankozha.calculator

import org.junit.Assert
import org.junit.Test

/**
 * Created by borikhankozha on 6/12/17.
 */
class ProblemSolverTests {
	
	val ps = ProblemSolver()
	
	@Test
	fun allMultDiv1_isCorrect() {
		Assert.assertEquals(ps.solveAllMultDiv("1*2*3+2*3"), "6.0+6.0")
	}
	
	@Test
	fun allMultDiv2_isCorrect() {
		Assert.assertEquals(ps.solveAllMultDiv("1/2*3+3/2"), "1.5+1.5")
	}
	
	@Test
	fun allMultDiv3_isCorrect() {
		Assert.assertEquals(ps.solveAllMultDiv("0*2*3+0*0"), "0.0+0.0")
	}
	
	@Test
	fun allMultDiv4_isCorrect() {
		Assert.assertEquals(ps.solveAllMultDiv("-3+2*3-1-1-1"), "0.0-3.0+6.0-1.0-1.0-1.0")
	}
	
	
	@Test
	fun allAddSub1_isCorrect() {
		Assert.assertEquals(ps.solveAllAddSub("6.0+6.0"), "12.0")
	}
	
	@Test
	fun allAddSub2_isCorrect() {
		Assert.assertEquals(ps.solveAllAddSub("1.5+1.5"), "3.0")
	}
	
	@Test
	fun allAddSub3_isCorrect() {
		Assert.assertEquals(ps.solveAllAddSub("0.0+0.0"), "0.0")
	}
	
	@Test
	fun allAddSub4_isCorrect() {
		Assert.assertEquals(ps.solveAllAddSub("0.0-3.0+6.0-1.0-1.0-1.0"), "0.0")
	}
	
}