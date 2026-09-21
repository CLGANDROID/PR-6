package com.example.menunavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ToolsScreen(modifier: Modifier = Modifier) {
    InfoPage(
        title = "Інструменти розробника",
        subtitle = "Чим створюють Android-застосунки",
        sections = listOf(
            InfoSection(
                "Android Studio",
                "Офіційне середовище розробки з 2014 року, створене Google на основі " +
                    "IntelliJ IDEA від JetBrains. Містить редактор коду, Preview, " +
                    "емулятор пристроїв і профайлери."
            ),
            InfoSection(
                "Kotlin",
                "Мова програмування від JetBrains, повністю сумісна з Java. З 2019 року " +
                    "Google дотримується підходу Kotlin-first і рекомендує її як основну " +
                    "мову для Android."
            ),
            InfoSection(
                "Jetpack Compose",
                "Декларативний інструментарій для побудови інтерфейсу: екрани " +
                    "описуються composable-функціями замість XML-розмітки. Стабільна " +
                    "версія 1.0 вийшла в липні 2021 року."
            ),
            InfoSection(
                "Бібліотеки Android Jetpack",
                "Набір бібліотек для типових завдань: Navigation, Room, ViewModel, " +
                    "Lifecycle тощо. Навігація в цьому застосунку реалізована " +
                    "бібліотекою Navigation Compose."
            ),
            InfoSection(
                "Gradle",
                "Система збірки. У файлах build.gradle.kts описуються залежності, " +
                    "версії SDK і параметри збірки застосунку."
            ),
            InfoSection(
                "ADB",
                "Android Debug Bridge — утиліта командного рядка для зв'язку з " +
                    "пристроєм: встановлення застосунків, перегляд журналів (logcat), " +
                    "бездротове налагодження."
            )
        ),
        modifier = modifier
    )
}
