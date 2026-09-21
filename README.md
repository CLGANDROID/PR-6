# Menu Navigation

Android-додаток «Довідник платформи Android», реалізований на Jetpack Compose. Застосунок містить три інформаційні сторінки про Android, а внизу кожної сторінки розташоване однакове меню з трьох кнопок для переходу між ними. Кнопка поточної сторінки заповнена, решта — контурні.

## Сторінки

| Сторінка | Маршрут | Зміст |
|---|---|---|
| Історія | `history` | Історія створення та розвитку Android: від заснування Android Inc. у 2003 році до сьогодення |
| Архітектура | `architecture` | Рівні програмного стеку платформи: ядро Linux, HAL, ART, нативні бібліотеки, Java API Framework, системні застосунки, компоненти застосунку |
| Інструменти | `tools` | Засоби розробки: Android Studio, Kotlin, Jetpack Compose, бібліотеки Jetpack, Gradle, ADB |

## Реалізація

- **Головний екран.** `MainActivity` викликає `enableEdgeToEdge()` і створює інтерфейс через `setContent`. Основний контейнер — composable-функція `MenuApp` з `Scaffold`: меню передається в параметр `bottomBar`, а `NavHost` займає основну область. Оскільки меню розташоване поза `NavHost`, воно однакове на всіх сторінках і не створюється заново під час переходів.
- **Перелік сторінок.** Клас `Page` (`enum class`) містить маршрут і підпис кнопки для кожної сторінки. Маршрути використовуються як `Page.History.route`, тому помилка в назві виявляється під час компіляції.
- **Меню.** `AppMenu` створює кнопки в циклі за `Page.entries`, а `weight(1f)` ділить ширину порівну. Поточна сторінка відображається через `Button`, решта — через `OutlinedButton`. Функція не залежить від бібліотеки навігації: вона отримує поточний маршрут і лямбду `onNavigate`. Відступ від системної панелі навігації забезпечує `navigationBarsPadding()`.
- **Шаблон сторінки.** `InfoPage` виводить заголовок, підзаголовок і розділи у вигляді карток `Card`. Дані розділу зберігає клас даних `InfoSection`. Контейнер `Column` має `verticalScroll(rememberScrollState())`, тому довгий текст прокручується.
- **Сторінки.** `HistoryScreen`, `ArchitectureScreen` і `ToolsScreen` лише передають у `InfoPage` заголовок і список розділів.
- **Граф навігації.** `AppNavHost` описує три маршрути, стартова сторінка — «Історія». Функція-розширення `NavHostController.navigateToPage()` виконує перехід із параметрами `popUpTo(graph.findStartDestination().id) { saveState = true }`, `launchSingleTop = true` і `restoreState = true`. Стек не росте під час натискань, повторне натискання не створює копію сторінки, а позиція прокручування зберігається. Кнопка «Назад» з будь-якої сторінки повертає на «Історію», а з неї закриває застосунок.
- **Підсвічування кнопки.** `currentBackStackEntryAsState()` повертає поточний запис стеку як стан Compose, тому після кожного переходу меню перемальовується з новим значенням `currentRoute`.
- **Передперегляд.** Для перевірки інтерфейсу без запуску на пристрої створено функцію `MenuAppPreview` з анотацією `@Preview`.

## Технології

- Kotlin
- Jetpack Compose (Material 3)
- Navigation Compose
- Android Studio

## Структура проєкту

```
app/src/main/java/com/example/menunavigation/MainActivity.kt
app/src/main/java/com/example/menunavigation/Page.kt
app/src/main/java/com/example/menunavigation/AppMenu.kt
app/src/main/java/com/example/menunavigation/InfoPage.kt
app/src/main/java/com/example/menunavigation/HistoryScreen.kt
app/src/main/java/com/example/menunavigation/ArchitectureScreen.kt
app/src/main/java/com/example/menunavigation/ToolsScreen.kt
app/src/main/java/com/example/menunavigation/AppNavHost.kt
app/src/main/java/com/example/menunavigation/ui/theme/   # кольори, тема, типографіка
```

## Запуск

1. Відкрити проєкт у Android Studio.
2. Дочекатися синхронізації Gradle.
3. Запустити конфігурацію `app` на емуляторі або фізичному пристрої.
