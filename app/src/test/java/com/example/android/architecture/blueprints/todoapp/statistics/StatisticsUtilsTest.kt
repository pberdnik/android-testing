package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class StatisticsUtilsTest {

    @Test
    fun `one active task THEN 100% active and 0% completed`() {
        val tasks = listOf(Task(isCompleted = false))

        val (activeTasksPercent, completedTasksPercent) = getActiveAndCompletedStats(tasks)

        assertThat(activeTasksPercent, `is`(100f))
        assertThat(completedTasksPercent, `is`(0f))
    }

    @Test
    fun `null tasks THEN 0% active and 0% completed`() {
        val tasks = null

        val (activeTasksPercent, completedTasksPercent) = getActiveAndCompletedStats(tasks)

        assertThat(activeTasksPercent, `is`(0f))
        assertThat(completedTasksPercent, `is`(0f))
    }

    @Test
    fun `no tasks THEN 0% active and 0% completed`() {
        val tasks = emptyList<Task>()

        val (activeTasksPercent, completedTasksPercent) = getActiveAndCompletedStats(tasks)

        assertThat(activeTasksPercent, `is`(0f))
        assertThat(completedTasksPercent, `is`(0f))
    }
}