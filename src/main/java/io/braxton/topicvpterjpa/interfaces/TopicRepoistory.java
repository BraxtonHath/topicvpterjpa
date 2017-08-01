package io.braxton.topicvpterjpa.interfaces;

import io.braxton.topicvpterjpa.models.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepoistory extends CrudRepository<Topic, Long> {

}
