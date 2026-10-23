package com.example.lab_7
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.runner.RunWith
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import org.junit.Test

@RunWith(AndroidJUnit4::class)
class DriversScreenTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    @Test
    fun navigate_to_drivers_add_driver_clear_and_return_home() {
        composeTestRule
            .onNodeWithTag("driverButton")
            .performClick()

        composeTestRule
            .onNodeWithText("FormulaZero Drivers")
            .assertExists()

        composeTestRule
            .onNodeWithTag("driverInput")
            .performTextInput("Driver 1")

        composeTestRule
            .onNodeWithTag("addButton")
            .performClick()

        composeTestRule
            .onNodeWithText("Driver 1")
            .assertExists()

        composeTestRule
            .onNodeWithTag("clearButton")
            .performClick()

        composeTestRule
            .onNodeWithTag("driverInput")
            .performTextInput("Driver 2")

        composeTestRule
            .onNodeWithTag("addButton")
            .performClick()

        composeTestRule
            .onNodeWithText("Driver 2")
            .assertExists()

        composeTestRule
            .onNodeWithTag("backButton")
            .performClick()

        composeTestRule
            .onNodeWithText("FormulaZero Home")
            .assertExists()
    }
}