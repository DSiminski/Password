package com.Password.configs.security.Repository;

import com.Password.entities.User;

import com.sun.xml.bind.v2.model.core.ID;
import org.apache.el.stream.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface AuthRepository extends JpaRepository<User, UUID> {

    @Query("FROM User usuario WHERE usuario.Email = :input OR usuario.Name = :input")
    Optional<User> findByLoginOrEmail(@Param("input")String input);

    @java.lang.Override
    default List<User> findAll() {
        return null;
    }

    @java.lang.Override
    default List<User> findAll(Sort sort) {
        return null;
    }

    @java.lang.Override
    default Page<User> findAll(Pageable pageable) {
        return null;
    }

    @java.lang.Override
    default List<User> findAllById(Iterable<UUID> ids) {
        return null;
    }

    @java.lang.Override
    default long count() {
        return 0;
    }

    @java.lang.Override
    default void deleteById(UUID uuid) {

    }

    @java.lang.Override
    default void delete(User entity) {

    }

    @java.lang.Override
    default void deleteAllById(Iterable<? extends UUID> ids) {

    }

    @java.lang.Override
    default void deleteAll(Iterable<? extends User> entities) {

    }

    @java.lang.Override
    default void deleteAll() {

    }

    @java.lang.Override
    default <S extends User> S save(S entity) {
        return null;
    }

    @java.lang.Override
    default <S extends User> java.util.List<S> saveAll(java.lang.Iterable<S> entities) {
        return null;
    }

    @java.lang.Override
    default java.util.Optional<User> findById(UUID uuid) {
        return java.util.Optional.empty();
    }

    @java.lang.Override
    default boolean existsById(UUID uuid) {
        return false;
    }

    @java.lang.Override
    default void flush() {

    }

    @java.lang.Override
    default <S extends User> S saveAndFlush(S entity) {
        return null;
    }

    @java.lang.Override
    default <S extends User> java.util.List<S> saveAllAndFlush(java.lang.Iterable<S> entities) {
        return null;
    }

    @java.lang.Override
    default void deleteAllInBatch(java.lang.Iterable<T> entities) {

    }

    @java.lang.Override
    default void deleteAllByIdInBatch(java.lang.Iterable<ID> ids) {

    }

    @java.lang.Override
    default void deleteAllInBatch() {

    }

    @java.lang.Override
    default User getOne(UUID uuid) {
        return null;
    }

    @java.lang.Override
    default User getById(UUID uuid) {
        return null;
    }

    @java.lang.Override
    default User getReferenceById(UUID uuid) {
        return null;
    }

    @java.lang.Override
    default <S extends User> java.util.Optional<S> findOne(Example<S> example) {
        return java.util.Optional.empty();
    }

    @java.lang.Override
    default <S extends User> java.util.List<S> findAll(Example<S> example) {
        return null;
    }

    @java.lang.Override
    default <S extends User> java.util.List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @java.lang.Override
    default <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @java.lang.Override
    default <S extends User> long count(Example<S> example) {
        return 0;
    }

    @java.lang.Override
    default <S extends User> boolean exists(Example<S> example) {
        return false;
    }

    @java.lang.Override
    default <S extends User, R> R findBy(Example<S> example, java.util.function.Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
