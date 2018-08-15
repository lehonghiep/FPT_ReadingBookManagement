/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.edu.service;

import fa.edu.repository.BookCaseRepository;
import fa.edu.repository.BookCaseRepositoryImp;

/**
 *
 * @author Hong Hiep IT
 */
public class BookCaseService {

    private static BookCaseRepository repository = new BookCaseRepositoryImp();

    public static boolean checkExistInBookCase(int bookcase_id, int book_id) {
        return repository.checkExistInBookCase(bookcase_id, book_id);
    }
    public static boolean addBookToBookCase(int bookcase_id, int book_id){
        return repository.addBookToBookCase(bookcase_id, book_id);
    }

    public static boolean deleteFromBookCase(int bookcase_id, int book_id) {
         return repository.deleteFromBookCase(bookcase_id, book_id);
    }
}
