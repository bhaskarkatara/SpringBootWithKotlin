package com.example.firstproject.allControllers

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("entries")
class ControlEntry {

    // making a empty map
    private val localList: HashMap<Long, DataModel> = HashMap()

    @GetMapping
    fun getAll(): HashMap<Long, DataModel> {
        return localList
    }

    @PostMapping
    fun addEntries(@RequestBody myEntry: DataModel): Boolean {
        localList[myEntry.id] = myEntry
        return true
    }

    @GetMapping("id/{myId}")
    fun getByID(@PathVariable myId: Long): DataModel? {
        return localList[myId]
    }

    @PutMapping("id/{id}")
    fun updateById(@PathVariable id: Long, @RequestBody myEntry: DataModel): DataModel? {
        return if (localList.containsKey(id)) {
            localList[id] = myEntry
            myEntry
        } else {
            null
        }
    }

    @DeleteMapping("id/{myId}")
    fun deleteById(@PathVariable myId: Long): DataModel? {
        return localList.remove(myId)
    }
}