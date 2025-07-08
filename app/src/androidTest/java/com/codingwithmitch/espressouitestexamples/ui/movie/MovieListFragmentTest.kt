package com.codingwithmitch.espressouitestexamples.ui.movie

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import com.codingwithmitch.espressouitestexamples.R
import com.codingwithmitch.espressouitestexamples.data.FakeMovieData
import com.codingwithmitch.espressouitestexamples.ui.movie.MoviesListAdapter.MovieViewHolder
import com.codingwithmitch.espressouitestexamples.util.EspressoIdlingResourceRule

import org.hamcrest.Matchers.*
import org.junit.*
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4::class)
class MovieListFragmentTest {

    private val LIST_ITEM_IN_TEST = 4
    private val MOVIE_IN_TEST = FakeMovieData.movies[LIST_ITEM_IN_TEST]

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @get:Rule
    val espressoIdlingResourceRule = EspressoIdlingResourceRule()

    @Test
    fun a_test_isListFragmentVisible_onAppLaunch() {
        onView(withId(R.id.recycler_view)).check(matches(isDisplayed()))
        onView(withId(R.id.progress_bar)).check(matches(not(isDisplayed())))
    }

//    @Test
//    fun test_selectListItem_isDetailFragmentVisible() {
//        println("Esperando título: ${MOVIE_IN_TEST.title}")
//
//        onView(withId(R.id.recycler_view))
//            .perform(actionOnItemAtPosition<MovieViewHolder>(LIST_ITEM_IN_TEST, click()))
//
//        Thread.sleep(500)
//
//        onView(allOf(withText(containsString(MOVIE_IN_TEST.title)), isDisplayed()))
//            .check(matches(isDisplayed()))
//    }

//    @Test
//    fun test_backNavigation_toMovieListFragment() {
//        println("Esperando título: ${MOVIE_IN_TEST.title}")
//
//        onView(withId(R.id.recycler_view))
//            .perform(actionOnItemAtPosition<MovieViewHolder>(LIST_ITEM_IN_TEST, click()))
//
//        Thread.sleep(500)
//
//        onView(allOf(withText(containsString(MOVIE_IN_TEST.title)), isDisplayed()))
//            .check(matches(isDisplayed()))
//
//        pressBack()
//
//        onView(withId(R.id.recycler_view)).check(matches(isDisplayed()))
//    }

//    @Test
//    fun test_navDirectorsFragment_validateDirectorsList() {
//        println("Esperando título: ${MOVIE_IN_TEST.title}")
//
//        onView(withId(R.id.recycler_view))
//            .perform(actionOnItemAtPosition<MovieViewHolder>(LIST_ITEM_IN_TEST, click()))
//
//        Thread.sleep(500)
//
//        onView(allOf(withText(containsString(MOVIE_IN_TEST.title)), isDisplayed()))
//            .check(matches(isDisplayed()))
//
//        // O id 'movie_directiors' tem typo? Se sim, mantenha conforme está
//        onView(withId(R.id.movie_directiors)).perform(click())
//
//        onView(withId(R.id.directors_text))
//            .check(matches(withText(
//                DirectorsFragment.stringBuilderForDirectors(MOVIE_IN_TEST.directors!!)
//            )))
//    }

//    @Test
//    fun test_navStarActorsFragment_validateActorsList() {
//        println("Esperando título: ${MOVIE_IN_TEST.title}")
//
//        onView(withId(R.id.recycler_view))
//            .perform(actionOnItemAtPosition<MovieViewHolder>(LIST_ITEM_IN_TEST, click()))
//
//        Thread.sleep(500)
//
//        onView(allOf(withText(containsString(MOVIE_IN_TEST.title)), isDisplayed()))
//            .check(matches(isDisplayed()))
//
//        onView(withId(R.id.movie_star_actors)).perform(click())
//
//        onView(withId(R.id.star_actors_text))
//            .check(matches(withText(
//                StarActorsFragment.stringBuilderForStarActors(MOVIE_IN_TEST.star_actors!!)
//            )))
//    }
}
