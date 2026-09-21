package com.example.menunavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ArchitectureScreen(modifier: Modifier = Modifier) {
    InfoPage(
        title = "Архітектура Android",
        subtitle = "Рівні програмного стеку платформи — знизу вгору",
        sections = listOf(
            InfoSection(
                "Ядро Linux",
                "Основа системи. Керує процесами, пам'яттю та живленням, містить " +
                    "драйвери пристроїв і забезпечує базові механізми безпеки."
            ),
            InfoSection(
                "Рівень апаратних абстракцій (HAL)",
                "Надає стандартні інтерфейси, через які вищі рівні звертаються до " +
                    "камери, Bluetooth, датчиків та іншого обладнання, не залежачи " +
                    "від конкретного виробника."
            ),
            InfoSection(
                "Android Runtime (ART)",
                "Середовище виконання застосунків. Кожен застосунок працює у власному " +
                    "процесі з власним екземпляром ART. Починаючи з Android 5.0, ART " +
                    "замінило віртуальну машину Dalvik."
            ),
            InfoSection(
                "Нативні бібліотеки C/C++",
                "Бібліотеки, на яких побудовані системні компоненти: OpenGL ES для " +
                    "графіки, SQLite для баз даних, медіабібліотеки для відтворення " +
                    "аудіо та відео."
            ),
            InfoSection(
                "Java API Framework",
                "Набір API, через які застосунки використовують можливості системи: " +
                    "Activity Manager, Notification Manager, Resource Manager, " +
                    "Content Providers та інші."
            ),
            InfoSection(
                "Системні застосунки",
                "Телефон, повідомлення, камера, браузер, контакти. Більшість із них " +
                    "користувач може замінити сторонніми застосунками."
            ),
            InfoSection(
                "Компоненти застосунку",
                "Activity — екран застосунку; Service — фонові завдання; " +
                    "BroadcastReceiver — реакція на системні події; ContentProvider — " +
                    "обмін даними між застосунками."
            )
        ),
        modifier = modifier
    )
}
