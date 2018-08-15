/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.edu.repository;

/**
 *
 * @author Hong Hiep IT
 */
public interface BookCaseRepository {
   boolean addBookToBookCase(int bookcase_id, int book_id);
   boolean checkExistInBookCase(int bookcase_id, int book_id);
   boolean deleteFromBookCase(int bookcase_id, int book_id);
}
