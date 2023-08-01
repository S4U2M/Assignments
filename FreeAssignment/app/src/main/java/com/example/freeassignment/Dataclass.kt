package com.example.freeassignment

data class Dataclass(
    var name: String,
    var roomNumber: Int,
    var checkInDate: String,
    var checkOutDate: String,
    val reservationMember: Array<Array<Any>> = Array(4) { index -> arrayOf(name, roomNumber,checkInDate, checkOutDate) }

)