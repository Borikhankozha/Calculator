package com.example.borikhankozha.calculator


import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import android.support.test.rule.ActivityTestRule

/**
 * Created by borikhankozha on 6/19/17.
 */
class UITests {

    @Rule @JvmField
    val activity = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun testNumberButtons(){
        onView(withId(R.id.one)).perform(click())
        onView(withId(R.id.two)).perform(click())
        onView(withId(R.id.three)).perform(click())
        onView(withId(R.id.four)).perform(click())
        onView(withId(R.id.five)).perform(click())
        onView(withId(R.id.six)).perform(click())
        onView(withId(R.id.seven)).perform(click())
        onView(withId(R.id.eight)).perform(click())
        onView(withId(R.id.nine)).perform(click())
        onView(withId(R.id.zero)).perform(click())

        onView(withId(R.id.display)).check(matches(withText("1234567890")))
    }

    @Test
    fun testOperationButtons(){
        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.div)).perform(click())
        onView(withId(R.id.mult)).perform(click())
        onView(withId(R.id.sub)).perform(click())

        onView(withId(R.id.display)).check(matches(withText("+/*-")))
    }

    @Test
    fun testEqualButtons(){
        onView(withId(R.id.one)).perform(click())
        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.two)).perform(click())
        onView(withId(R.id.mult)).perform(click())
        onView(withId(R.id.nine)).perform(click())
        onView(withId(R.id.equal)).perform(click())

        onView(withId(R.id.display)).check(matches(withText("1+2*9")))
        onView(withId(R.id.answer)).check(matches(withText("19.0")))
    }

    @Test
    fun testBackButtons(){
        onView(withId(R.id.one)).perform(click())
        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.two)).perform(click())
        onView(withId(R.id.mult)).perform(click())
        onView(withId(R.id.nine)).perform(click())
        onView(withId(R.id.equal)).perform(click())

        onView(withId(R.id.display)).check(matches(withText("1+2*9")))

        onView(withId(R.id.back)).perform(click())
        onView(withId(R.id.back)).perform(click())

        onView(withId(R.id.display)).check(matches(withText("1+2")))
    }

    @Test
    fun testClearButtons(){
        onView(withId(R.id.one)).perform(click())
        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.two)).perform(click())
        onView(withId(R.id.mult)).perform(click())
        onView(withId(R.id.nine)).perform(click())
        onView(withId(R.id.equal)).perform(click())

        onView(withId(R.id.clear)).perform(click())

        onView(withId(R.id.display)).check(matches(withText("")))
    }
}