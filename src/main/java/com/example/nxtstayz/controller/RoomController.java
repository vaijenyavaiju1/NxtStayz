package com.example.nxtstayz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.nxtstayz.model.*;
import com.example.nxtstayz.service.*;

@RestController
public class RoomController {
    @Autowired
    public RoomJpaService roomService;

    @GetMapping("/hotels/rooms")
    public ArrayList<Room> getRooms() {
        return roomService.getRooms();
    }

    @GetMapping("/hotels/rooms/{roomId}")
    public Room getRoomById(@PathVariable("roomId") int roomId) {
        return roomService.getRoomById(roomId);
    }

    @PostMapping("/hotels/rooms")
    public Room addRoom(@RequestBody Room room) {
        return roomService.addRoom(room);

    }

    @PutMapping("/hotels/rooms/{roomId}")
    public Room updateRoom(@PathVariable("roomId") int roomId, @RequestBody Room room) {
        return roomService.updateRoom(roomId, room);
    }

    @DeleteMapping("/hotels/rooms/{roomId}")
    public void deleteRoom(@PathVariable("roomId") int roomId) {
        roomService.deleteRoom(roomId);
    }

    @GetMapping("/rooms/{roomId}/hotel")
    public Hotel getRoomHotel(@PathVariable("roomId") int roomId) {
        return roomService.getRoomHotel(roomId);
    }

}