package ua.com.levelup.cafeproj.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.com.levelup.cafeproj.model.User;

/**
 * Все спринг-репозитори - это дженерики с двойным типом. Первый - тип Entity, второй - тип ID
 * Репозитори - спрингловая замена (аналог) DAO
 */
@Repository
public interface UserRepo extends CrudRepository<User,Long> {
//хоть интерфейс и пустой, здесь уже есть ряд базовых методов из CrudRepository
}
