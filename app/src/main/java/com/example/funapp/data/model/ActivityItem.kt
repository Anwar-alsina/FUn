package com.example.funapp.data.model

class ActivityItem {
    var activityImage: Int? = 0
    var activityTitle: String? = null

    constructor(activityImage: Int?, activityTitle: String?) {
        this.activityImage = activityImage
        this.activityTitle = activityTitle
    }
}