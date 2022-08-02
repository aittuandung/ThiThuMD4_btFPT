package com.btfpt.service;

import com.btfpt.repository.IBranchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService {
    @Autowired
    IBranchRepo iBranchRepo;

//    public List<Branch> getAll(){
//        return
//    }
}
