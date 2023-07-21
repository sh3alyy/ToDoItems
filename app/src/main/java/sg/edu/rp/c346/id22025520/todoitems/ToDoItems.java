package sg.edu.rp.c346.id22025520.todoitems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.Calendar;

public class ToDoItems{

    private String title;
    private Calendar date;

    public ToDoItems(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+(date.get(Calendar.MONTH) +1)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    private String getDay(int day) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[day - 1];    }
}
