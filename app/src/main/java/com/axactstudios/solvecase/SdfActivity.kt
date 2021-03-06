package com.axactstudios.solvecase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_maths.*
import java.util.*
import kotlin.collections.ArrayList

class SdfActivity : AppCompatActivity(), onVideoItemClickListener {

    var video = ArrayList<videoDetailsModel>()
    val displayList = ArrayList<videoDetailsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sdf)

        var recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)

        video.add(videoDetailsModel("Enumerated Type","9QdJExC2AVg"))
        video.add(videoDetailsModel("Introduction to Structures in C","zmRxC7gYw-g"))
        video.add(videoDetailsModel("Declaration of structure variables","3pFSbSVIwKU"))
        video.add(videoDetailsModel("Structure types","IPLPISOXvF0"))
        video.add(videoDetailsModel("Initialising and accessing structure members","2DidKZmwNMo"))
        video.add(videoDetailsModel("Designated initialisation","WUbp4gHR6_8"))
        video.add(videoDetailsModel("Array of structures","EGeIsvx4Wns"))
        video.add(videoDetailsModel("Pointer to structures","VsnXsfNstVw"))
        video.add(videoDetailsModel("Introduction to unions in C","oySsPUDr35U"))
        video.add(videoDetailsModel("Application of unions part 1","QOFjQMdtoRA"))
        video.add(videoDetailsModel("Application of unions part 2","7eHRoAjFepU"))
        video.add(videoDetailsModel("Introduction to pointers in C","d26HpQ2DKUo"))
        video.add(videoDetailsModel("Introduction to pointers in C continued ","8aBNPSIziuw"))
        video.add(videoDetailsModel("Application of Pointers in C","bcAn3s-GltY"))
        video.add(videoDetailsModel("Application of Pointers in C Part 2","VwHO8jHiygQ"))
        video.add(videoDetailsModel("Application of Pointers in C Part 3","yGhdI6kQXDc"))
        video.add(videoDetailsModel("Application of Pointers in C Part 4","cRKINlLFrGY"))
        video.add(videoDetailsModel("Application of pointers in C Part 5","OxlYhsVBvHM"))
        video.add(videoDetailsModel("Dynamic Memory Allocation in C Language Part 1","ZSzzY3adfDM"))
        video.add(videoDetailsModel("Dynamic Memory Allocation in C language Part 2","nd7WJ4Q9gog"))
        video.add(videoDetailsModel("Introduction to File Handling in C","QToupvpxfMc"))
        video.add(videoDetailsModel("File Management fopen() and fclose() in C","AlQ7Z137RDE"))
        video.add(videoDetailsModel("File Management getc() and putc() in C","F8ci5HBa3C8"))
        video.add(videoDetailsModel("Example Program for File Handling in C","aL2a0UwaXyM"))
        video.add(videoDetailsModel("File Management fgets() and fputs() in C","1SPUNmCa0yc"))
        video.add(videoDetailsModel("File Management getw() and putw() in C","wDMPoFNOtfY"))
        video.add(videoDetailsModel("Example Program for getw() and putw() in C","UDLDJ_srfcU"))
        video.add(videoDetailsModel("File Management fprintf() and fscanf() in C","9W-Ha4wRULc"))
        video.add(videoDetailsModel("Example Program for fprintf() and fscanf() in C","sdkvKOvqwAA"))
        video.add(videoDetailsModel("Example Program for feof() and ferror() in C","-f_9CIAj8c0"))
        video.add(videoDetailsModel("Checking Whether File is Opened or Not in C","xjVr5dVbTo8"))
        video.add(videoDetailsModel("File Opening Modes in C","CyqS3ymoPZc"))
        video.add(videoDetailsModel("fseek() ftell() and rewind() in C","xtEdjl2LVu8"))
        video.add(videoDetailsModel("Example Program for fseek() ftell() and rewind() in C","S9TCgHKjbSw"))
        video.add(videoDetailsModel("fread() and fwrite() Function in C","EETBQ3yWcFA"))
        video.add(videoDetailsModel("Linear Search Algorithm with example","C46QfTjVCNU"))
        video.add(videoDetailsModel("Binary Search Algorithm with example","V_T5NuccwRA"))
        video.add(videoDetailsModel("Bubble Sort","zxy3WMOzPwc"))
        video.add(videoDetailsModel("Insertion Sort","ep8uG1IBApQ"))
        video.add(videoDetailsModel("Selection Sort","qSRHW32sHow"))
        video.add(videoDetailsModel("Introduction to linked list","dmb1i4oN5oE"))
        video.add(videoDetailsModel("Types of linked list in data structures","DWpVGpNfDmM"))
        video.add(videoDetailsModel("Arrays vs Linked List","qauEA64G1Ds"))
        video.add(videoDetailsModel("Linked List implementation in C","6wXZ_m3SbEs"))
        video.add(videoDetailsModel("Insert a node in Singly Linked List (at beginning, end, specified position)","dq3F3e9o2DM"))
        video.add(videoDetailsModel("Delete a node from linked list (from beginning, end, specified position)","ClvYytk5Rlg"))
        video.add(videoDetailsModel("Find length of linked list - Iterative approach","SbGRuk38MvI"))
        video.add(videoDetailsModel("Reverse a linked list - Iterative method","Tk_fi5l8cag"))
        video.add(videoDetailsModel("Introduction to Doubly Linked List ","nquQ_fYGGA4"))
        video.add(videoDetailsModel("Implementation of Doubly Linked List","H8-IuKKiQeo"))
        video.add(videoDetailsModel("Insertion in Doubly Linked List(beginning, end, specific position)","v4szCPs9yEY"))
        video.add(videoDetailsModel("Deletion from doubly linked list (from beginning, end, specific position)","7yNUXcOcHwE"))
        video.add(videoDetailsModel("Reverse a doubly linked list","_6JI9XdO8nM"))
        video.add(videoDetailsModel("Circular linked list in data structure - Creation and display","fmfx1C4TTxw"))
        video.add(videoDetailsModel("Implementation of Circular linked list","jsTybZ5qSNE"))
        video.add(videoDetailsModel("Circular linked list - Insertion","ReGglEXEH08"))
        video.add(videoDetailsModel("Circular linked list - deletion (from beginning, end, given position)","EkE6RHuMx3I"))
        video.add(videoDetailsModel("Reverse a circular linked list","xvAoleV706Q"))
        video.add(videoDetailsModel("Doubly Circular Linked List - Creation and Display","eBCTtS_sptM"))
        video.add(videoDetailsModel("Doubly Circular linked list - Insertion","Fa958fGdgx0"))
        video.add(videoDetailsModel("Doubly circular linked list - Deletion","ElQxT6hDeNE"))
        video.add(videoDetailsModel("Introduction to stack","bxRVz8zklWM"))
        video.add(videoDetailsModel("Implementation of stack using Array","VmsTAVpz0xo"))
        video.add(videoDetailsModel("Stack implementation using linked list","T_UXDTy23DQ"))
        video.add(videoDetailsModel("Infix Prefix and Postfix expressions","RY4GkLahbCI"))
        video.add(videoDetailsModel("Infix to Postfix conversion rules using STACK","TB7qzDgX-pI"))
        video.add(videoDetailsModel("Infix to Postfix using stack","PAceaOSnxQs"))
        video.add(videoDetailsModel("Infix to Postfix conversion using Stack","YHSj87pgjF8"))
        video.add(videoDetailsModel("Infix to prefix using stack","8QxlrRws9OI"))
        video.add(videoDetailsModel("Evaluation of Prefix and Postfix expressions using stack","o6vj5l_W2h8"))
        video.add(videoDetailsModel("Postfix Expression evaluation using Stack","u3paQa8KXu0"))
        video.add(videoDetailsModel("Prefix to infix conversion | Postfix to infix conversion","1zqgyoZzda4"))
        video.add(videoDetailsModel("Introduction to queues","zp6pBNbUB2U"))
        video.add(videoDetailsModel("Implementation of queue using Arrays","YqrFeU90Coo"))
        video.add(videoDetailsModel("Queue implementation using linked list","RN1wzY_tnYU"))
        video.add(videoDetailsModel("Circular queue in data structure","dn01XST9-bI"))
        video.add(videoDetailsModel("Circular queue using linked list","40Ttkii9NPA"))
        video.add(videoDetailsModel("Implement Queue Using Stack",""))
        video.add(videoDetailsModel("Double Ended Queue","pqg0SOPRlJ4"))
        video.add(videoDetailsModel("Implementation of DEQUE using circular array","WJres9mgiAk"))
        video.add(videoDetailsModel("Introduction to trees","YAdLFsTG70w"))
        video.add(videoDetailsModel("Binary Tree and its Types","vvey2QCs98o"))
        video.add(videoDetailsModel("Binary Tree Implementation","6vt3PFRC11E"))
        video.add(videoDetailsModel("Array representation of binary tree","zDlTxrEwxvg"))
        video.add(videoDetailsModel("Binary Tree Traversals (Inorder, Preorder and Postorder)","-b2lciNd2L4"))
        video.add(videoDetailsModel("Binary Tree traversal : Preorder, Inorder, Postorder","e_Wv_pH4Se8"))
        video.add(videoDetailsModel("Construct Binary Tree from Preorder and Inorder traversal with example","PoBGyrIWisE"))
        video.add(videoDetailsModel("Construct Binary Tree from Postorder and Inorder with example","s5XRtcud35E"))
        video.add(videoDetailsModel("Construct Binary Tree from Preorder and Postorder traversal","5lWJpTEnyow"))
        video.add(videoDetailsModel("Binary Search Trees (BST) - Insertion and Deletion Explained","cySVml6e_Fc"))
        video.add(videoDetailsModel("Construct Binary Search Tree (BST) from Preorder","GW63gMgfeS8"))
        video.add(videoDetailsModel("Construct a Binary Search Tree (BST) from given Postorder traversal","RttBwUVWfV8"))
        video.add(videoDetailsModel("Object Oriented Programming in C++ for beginners","h4kUiFOb_v0"))
        video.add(videoDetailsModel("Class And Object With Examples In C++","6Q0Cff29YwU"))
        video.add(videoDetailsModel("Class Properties, Methods, Members","qnCRKjPTnHM"))
        video.add(videoDetailsModel("Scope Resolution Operator in C++","3KzXA1bkyak"))
        video.add(videoDetailsModel("Access Specifiers in C++","8N88mPdXBvg"))
        video.add(videoDetailsModel("Static Data Members in C++ & Static Member Functions in C++","1QTZeeDL0bc"))
        video.add(videoDetailsModel("Constructors & Destructors in C++ Programming","hAA8FBq2bA4"))
        video.add(videoDetailsModel("Single inheritance in c++","nqkNhisTSgE"))
        video.add(videoDetailsModel("Multiple inheritance in c++","X_l4-LOW7G4"))
        video.add(videoDetailsModel("Multilevel inheritance in C++","d5JLy3L82sM"))
        video.add(videoDetailsModel("Function Overloading in C++","dh0mKAPFzlQ"))
        video.add(videoDetailsModel("Operator Overloading in C++","BO2KagRMS3M"))
        video.add(videoDetailsModel("Virtual Functions & Abstract Classes in C++","JU8DbwBvOWE"))
        video.add(videoDetailsModel("Software Development Life Cycle (SDLC)","G-6qDY8UltU"))
        displayList.addAll(video)

        var adapter = recyclerViewAdapter(displayList,clickListener = this)

        recyclerView.setAdapter(adapter)
    }

    override fun onItemClick(item: videoDetailsModel, position: Int) {
        //Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show()
        val intent = Intent(this,YouTubePlayerActivity::class.java)
        intent.putExtra("videoname",item.title)
        intent.putExtra("videokey",item.videokey)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu, menu)
        val menuItem = menu!!.findItem(R.id.search)

        if (menuItem!=null) {
            val searchView = menuItem.actionView as androidx.appcompat.widget.SearchView

            val editText = searchView.findViewById<EditText>(androidx.appcompat.R.id.search_src_text)
            editText.hint = "Search"

            searchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {

                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {

                    if (newText!!.isNotEmpty()) {
                        displayList.clear()
                        val search = newText.toLowerCase(Locale.getDefault())
                        video.forEach {
                            if (it.title.toLowerCase(Locale.getDefault()).contains(search)) {
                                displayList.add(it)
                            }
                        }

                        recyclerView.adapter!!.notifyDataSetChanged()

                    }

                    else {
                        displayList.clear()
                        displayList.addAll(video)
                        recyclerView.adapter!!.notifyDataSetChanged()
                    }

                    return true
                }
            })
        }

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}
