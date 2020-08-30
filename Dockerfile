# Use an exisiting docker image as base
FROM alpine



#Download and install dependency
RUN apk add --update redis
RUN apk add --update gcc




#Tell the image what to do when it starts as container
CMD ["redis-server"]



