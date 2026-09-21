package com.example.menunavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = Page.History.route,
        modifier = modifier
    ) {
        composable(Page.History.route) { HistoryScreen() }
        composable(Page.Architecture.route) { ArchitectureScreen() }
        composable(Page.Tools.route) { ToolsScreen() }
    }
}

fun NavHostController.navigateToPage(page: Page) {
    navigate(page.route) {
        popUpTo(graph.findStartDestination().id) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}
