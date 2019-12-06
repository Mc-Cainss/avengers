TAG=v1
IMAGE=mccains/avengers/startupscript

.PHONY: build push

build:
	docker build --pull -t $(IMAGE):$(TAG) .

push: build
	gcloud docker -- push $(IMAGE):$(TAG)