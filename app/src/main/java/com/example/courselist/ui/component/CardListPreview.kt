package com.example.courselist.ui.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

import com.example.courselist.ui.theme.CourseListTheme

@Preview(
    name = "Light Mode",
    showBackground = true,
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO
)
@Preview(
    name = "Dark Mode",
    showBackground = true,
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun CourseCardPreview() {
    CourseListTheme {
        CourseCard(
            courseTitle = "Mobile App Development",
            courseCode = "CS310",
            creditHours = 3,
            description = "Learn to build Android apps using Jetpack Compose and Kotlin.",
            prerequisites = "CS201"
        )
    }
}
