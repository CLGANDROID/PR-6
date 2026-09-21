package com.example.menunavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HistoryScreen(modifier: Modifier = Modifier) {
    InfoPage(
        title = "Історія Android",
        subtitle = "Як з'явилася найпоширеніша мобільна операційна система",
        sections = listOf(
            InfoSection(
                "2003 — заснування Android Inc.",
                "Компанію заснували Енді Рубін, Річ Майнер, Нік Сірс і Кріс Вайт. " +
                    "Спочатку планували створити операційну систему для цифрових " +
                    "фотокамер, але згодом переорієнтувалися на мобільні телефони."
            ),
            InfoSection(
                "2005 — купівля компанією Google",
                "Google придбала Android Inc. і продовжила розробку системи " +
                    "на основі ядра Linux."
            ),
            InfoSection(
                "2007 — анонс платформи",
                "У листопаді 2007 року Google разом з альянсом Open Handset Alliance, " +
                    "до якого увійшли виробники телефонів, мобільні оператори та " +
                    "виробники мікросхем, представила Android як відкриту платформу."
            ),
            InfoSection(
                "2008 — перший смартфон",
                "Восени 2008 року вийшов HTC Dream (T-Mobile G1) — перший серійний " +
                    "смартфон на Android. Одночасно запрацював магазин застосунків " +
                    "Android Market, який згодом перейменували на Google Play."
            ),
            InfoSection(
                "Солодкі назви версій",
                "Версії від Android 1.5 Cupcake до Android 9 Pie отримували назви " +
                    "десертів в алфавітному порядку. Починаючи з Android 10 (2019), " +
                    "Google відмовилася від таких назв на користь номерів."
            ),
            InfoSection(
                "Сьогодні",
                "Android — найпоширеніша мобільна операційна система у світі: нею " +
                    "користуються понад 70 % власників смартфонів. Вихідний код системи " +
                    "відкритий у межах проєкту AOSP (Android Open Source Project)."
            )
        ),
        modifier = modifier
    )
}
