package com.example.borikhankozha.calculator

import org.junit.Assert
import org.junit.Test

/**
 * Created by borikhankozha on 6/12/17.
 */
class ProblemSolverTest {
	val ps = ProblemSolver()
	
	@Test
	fun allMultDiv1_isCorrect() {
		Assert.assertEquals(ps.solveAllMultDiv("1*2*3+2*3"), "6.0+6.0")
	}
}