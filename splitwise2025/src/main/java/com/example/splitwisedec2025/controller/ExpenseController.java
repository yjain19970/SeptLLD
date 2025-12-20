package com.example.splitwisedec2025.controller;

import com.example.splitwisedec2025.dto.CreateExpenseRequestDTO;
import com.example.splitwisedec2025.dto.CreateExpenseResponseDTO;
import com.example.splitwisedec2025.exception.InvalidRequestException;
import com.example.splitwisedec2025.model.Expense;
import com.example.splitwisedec2025.service.ExpenseServiceImpl;

public class ExpenseController {

    private ExpenseServiceImpl expenseServiceImpl;
    
    public ExpenseController(ExpenseServiceImpl expenseServiceImpl) {
        this.expenseServiceImpl = expenseServiceImpl;
    }



    public CreateExpenseResponseDTO createExpense(CreateExpenseRequestDTO requestDTO) throws InvalidRequestException{
       if(isRequestInvalid(requestDTO)){
            throw new InvalidRequestException();
       }
       
       Expense expense =  expenseServiceImpl.createExpense(requestDTO.getCreatedByUserId(), requestDTO.getDescription(),
                requestDTO.getSplitType(), requestDTO.getTotalAmount(), requestDTO.getUserIds());
        
    return new CreateExpenseResponseDTO(expense.getId(), requestDTO.getDescription());
    }



    /**
     * Implement this method later.
     * @param requestDTO
     * @return
     */
    private boolean isRequestInvalid(CreateExpenseRequestDTO requestDTO) {
        return false;
    }

}
