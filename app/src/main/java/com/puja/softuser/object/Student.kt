package com.puja.softuser.`object`

import com.puja.softuser.model.student

object Student {
    var lstStudent= arrayListOf<student>()
    fun addStudent(){
        lstStudent= arrayListOf();
        lstStudent.add(
            student(
            studentName ="Puja Neupane",studentAge = "19",studentGender = "Female",
            studentAddress ="Sinamangal"
        )
        )

        lstStudent.add(student(
            studentName ="Rakesh Singh",studentAge = "22",studentGender = "Male",
            studentAddress ="Koteswor"
        ))
    }
}