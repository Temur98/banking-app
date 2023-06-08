package uz.najottalim.bankingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.najottalim.bankingapp.service.TransactionService;

@RestController
@RequestMapping("balances")
public class BalanceController {

    @Autowired
    private TransactionService balanceService;

//    @GetMapping("/{id}")
//    public ResponseEntity<BalanceDTO> getBalanceById(@PathVariable Long id){
//        return balanceService.getBalanceById(id);
//    }
//
//    @GetMapping
//    public ResponseEntity<BalanceDTO> getAllBalance(){
//        return balanceService.getAllBalance();
//    }
//
//    @PutMapping
//    public ResponseEntity<BalanceDTO> addBalance(@RequestBody BalanceDTO balanceDTO){
//        return balanceService.addBalance(balanceDTO);
//    }
//
//    @PostMapping
//    public ResponseEntity<BalanceDTO> updateBalance(@RequestBody BalanceDTO balanceDTO){
//        return balanceService.addBalance(balanceDTO);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<BalanceDTO> deleteBalance(@PathVariable Long id){
//        return balanceService.deleteBalance(id);
//    }
}
