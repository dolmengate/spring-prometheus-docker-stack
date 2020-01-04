#### What's this?
Preconfigured `docker-compose` stack set up to:  
- build this Spring project  (`localhost:8080`)
- scrape metrics with Prometheus (`localhost:9090`)
- visualize it with Grafana (`localhost:3000`)
- monitor the above containers with cAdvisor (`localhost:8081`)

#### To run
`docker-compose -f docker-compose.yml up`


#### Bugs  
- Grafana provisioning of Prometheus datasource isn't working, have to add it yourself through the Grafana web UI