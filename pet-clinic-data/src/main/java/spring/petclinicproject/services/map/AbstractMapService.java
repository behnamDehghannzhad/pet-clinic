package spring.petclinicproject.services.map;

import spring.petclinicproject.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    void save(T object) {
        if (Objects.nonNull(object)) {
            if (Objects.nonNull(object.getId())) {
                Long nextKey = getNextKey();
                map.put(nextKey, object);
            }
        } else {
            throw new RuntimeException("object is null");
        }
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    Long getNextKey() {
        Long nextKey;
        try {
            nextKey = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextKey = 1L;
        }
        return nextKey;
    }
}
